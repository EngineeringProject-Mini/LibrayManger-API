package librarymanagementsystem;

import librarymanagementsystem.LibraryManagementSystem;
import librarymanagementsystem.enums.ItemType;
import librarymanagementsystem.models.BookCopy;
import librarymanagementsystem.models.LibraryItem;
import librarymanagementsystem.models.Member;
import librarymanagementsystem.strategy.SearchByAuthorStrategy;
import librarymanagementsystem.strategy.SearchByTitleStrategy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    private final LibraryManagementSystem library = LibraryManagementSystem.getInstance();

    // --- Item Management ---
    @PostMapping("/items")
    public List<BookCopy> addItem(@RequestParam ItemType type,
                                  @RequestParam String id,
                                  @RequestParam String title,
                                  @RequestParam String author,
                                  @RequestParam int numCopies) {
        return library.addItem(type, id, title, author, numCopies);
    }

    // --- Member Management ---
    @PostMapping("/members")
    public Member addMember(@RequestParam String id, @RequestParam String name) {
        return library.addMember(id, name);
    }

    // --- Search ---
    @GetMapping("/search/title")
    public List<LibraryItem> searchByTitle(@RequestParam String query) {
        return library.search(query, new SearchByTitleStrategy());
    }

    @GetMapping("/search/author")
    public List<LibraryItem> searchByAuthor(@RequestParam String query) {
        return library.search(query, new SearchByAuthorStrategy());
    }

    // --- Checkout ---
    @PostMapping("/checkout")
    public String checkout(@RequestParam String memberId, @RequestParam String copyId) {
        library.checkout(memberId, copyId);
        return "Checkout attempted for memberId=" + memberId + ", copyId=" + copyId;
    }

    // --- Return ---
    @PostMapping("/return")
    public String returnItem(@RequestParam String copyId) {
        library.returnItem(copyId);
        return "Return attempted for copyId=" + copyId;
    }

    // --- Place Hold ---
    @PostMapping("/hold")
    public String placeHold(@RequestParam String memberId, @RequestParam String itemId) {
        library.placeHold(memberId, itemId);
        return "Hold placed by memberId=" + memberId + " on itemId=" + itemId;
    }

    // --- Catalog ---
//    @GetMapping("/catalog")
//    public List<LibraryItem> getCatalog() {
//        return library.search("", query -> List.copyOf(library.search(query, new SearchByTitleStrategy())));
//    }
}

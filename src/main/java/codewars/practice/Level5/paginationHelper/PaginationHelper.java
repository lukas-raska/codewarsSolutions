package codewars.practice.Level5.paginationHelper;

import java.util.List;

public class PaginationHelper<I> {

    private List<I> collection;

    private int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (collection.isEmpty()) ? 0 : (int) Math.ceil(itemCount() / ((double) itemsPerPage));
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        int lastPageIndex = pageCount() - 1;
        int restItems = itemCount() % this.itemsPerPage;

        if (pageIndex < 0 || pageIndex > lastPageIndex) {
            return -1;
        }

        if (pageIndex == lastPageIndex) {
            return (restItems > 0) ? restItems : this.itemsPerPage;
        }
        return this.itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount() || collection.isEmpty()) {
            return -1;
        }
        return itemIndex / this.itemsPerPage;
    }
}


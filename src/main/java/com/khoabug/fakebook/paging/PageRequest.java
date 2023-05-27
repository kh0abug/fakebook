package com.khoabug.fakebook.paging;

import com.khoabug.fakebook.sort.Sorter;

public class PageRequest {

    private int page;
    private int visibleItem;
    private int totalItem;
    private int totalPage;
    private Sorter sorter;

    public int getPage() {
        return page;
    }

    public int getOffset() {
        if (page != -1 && visibleItem != -1) {
            return (page - 1) * visibleItem;
        }
        return -1;
    }

    public int getVisibleItem() {
        return visibleItem;
    }

    public Sorter getSorter() {
        return (sorter != null) ? sorter : null;
    }

    public int getTotalItem() {
        return totalItem;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setVisibleItem(int visibleItem) {
        this.visibleItem = visibleItem;
    }

    public void setTotalItem(int totalItem) {
        this.totalItem = totalItem;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage() {
        this.totalPage = (int) Math.ceil((double) totalItem / visibleItem);
    }
}

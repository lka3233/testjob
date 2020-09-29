package ru.himerovich.onlinenotes.models;

public class SearchRequest {
    private int searchparam;
    private String searchstring;

    public int getSearchparam() {
        return searchparam;
    }

    public void setSearchparam(int searchparam) {
        this.searchparam = searchparam;
    }

    public String getSearchstring() {
        return searchstring;
    }

    public void setSearchstring(String searchstring) {
        this.searchstring = searchstring;
    }
}

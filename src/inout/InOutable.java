package src.inout;

import java.util.List;

import toy.Toy;

public interface InOutable {
    void fileUpload(List<Toy> t);

    List<Toy> fileDownload();
}

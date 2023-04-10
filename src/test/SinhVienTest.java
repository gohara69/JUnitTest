import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienTest {
    @Test
    public void Tb8Rl82NenTraVeGioi(){
        var sv = new SinhVien();
        Assertions.assertTrue("Giỏi" == sv.coNhanDuocHocBong(8,82));
    }

    @Test
    public void Tb8Rl78NenTraVeKha(){
        var sv = new SinhVien();
        Assertions.assertTrue("Khá" == sv.coNhanDuocHocBong(8,82));
    }

    @Test
    public void Tb9Rl92NenTraVeXuatSac(){
        var sv = new SinhVien();
        Assertions.assertTrue("Xuất Sắc" == sv.coNhanDuocHocBong(9,92));
    }
}
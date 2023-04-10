import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToanHaiSoTest {
    @Test
    public void haiCongHaiNenTraVeBon(){
        var baiToan = new ToanHaiSo();
        Assertions.assertEquals(4, baiToan.tongHaiSo(2,2));
    }

    @Test
    public void baCongBonNenTraVeBay(){
        var baiToan = new ToanHaiSo();
        Assertions.assertEquals(6, baiToan.tongHaiSo(3,4));
    }
}
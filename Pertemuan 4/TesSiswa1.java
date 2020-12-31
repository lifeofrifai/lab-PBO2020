public class TesSiswa1
{
    public static void main(String[] ar)
    { 
        Siswa1 s = new Siswa1();
        Siswa1 ss = new Siswa1(8030001, "Mahmud"); 
        
        //ini akan menimbulkan error
        //Siswa sss = new Siswa(8030002);  

        System.out.println(s.getNrp() + "  " + s.getNama()); 
        System.out.println(ss.getNrp() + "  " + ss.getNama());

        System.out.println(s);
        System.out.println(ss);
    } 
}

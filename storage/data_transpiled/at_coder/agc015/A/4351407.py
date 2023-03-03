def import java.io.InputStream
import java.io.Scanner
class MyScanner ( java.io.InputStream ) :
    def __init__ ( self ) :
        stream = java.io.InputStream ( )
    def read ( self ) :
        ret = 0
        try :
            while True :
                readed = yield from stream.read ( 1 )
                if readed < '0' or readed > '9' :
                    break
                ret = ret * 10 + ( readed - '0' )
        except java.io.EOFException :
            pass
        finally :
            return ret
    class Main ( java.io.Scanner ) :
        def __init__ ( self , args ) :
            sc = java.io.Scanner ( )
            n , a , b = sc.next ( ) , sc.next ( ) , sc.next ( )
            min , max = b + a * ( n - 1 ) , a + b * ( n - 1 )
            if max < min :
                print ( 0 )
            else :
                print ( max - min + 1 )

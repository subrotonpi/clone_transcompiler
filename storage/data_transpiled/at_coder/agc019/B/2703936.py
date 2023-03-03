def import import _main
class Main ( Scanner ) :
    def __init__ ( self , sc ) :
        a = sc.next ( )
        c = a.split ( )
        c = c [ : ]
        cnt = [ 0 ] * 26
        for i in range ( len ( c ) ) :
            for j in ( 'a' , 'z' ) :
                if c [ i ] == j :
                    cnt [ j - 'a' ] += 1
        max = len ( c ) * ( len ( c ) - 1 ) / 2
        for i in range ( 26 ) :
            max -= ( cnt [ i ] * ( cnt [ i ] - 1 ) / 2 )
        print ( max + 1 )
    def main ( ) :
        sc = Scanner ( )
        Main ( sc )
        sc.close ( )

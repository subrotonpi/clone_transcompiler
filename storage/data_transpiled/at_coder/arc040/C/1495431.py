def import _main
class Main ( object ) :
    def __init__ ( self , r , c ) :
        for i in range ( 0 , c ) :
            g [ r ] [ i ] = 'o'
        if r + 1 < n :
            for i in range ( c , n ) :
                g [ r + 1 ] [ i ] = 'o'
    def main ( self ) :
        with open ( "/proc/test.txt" , "r" ) as sc :
            n = sc.read ( )
        g = [ ]
        for i in range ( n ) :
            data = sc.read ( )
            for j in range ( n ) :
                g [ i ] [ j ] = data [ j ]
        ans = 0
        for i in range ( n ) :
            for j in range ( n - 1 , - 1 , - 1 ) :
                if g [ i ] [ j ] == '.' :
                    ans += 1
                    p ( i , j )
        print ( ans )

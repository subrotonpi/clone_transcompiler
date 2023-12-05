def _import ( ) :
    from math import pow
    class A ( object ) :
        def calc ( a , b ) :
            i = 0
            res = 0
            if a == 1 :
                return 100000
            while i < len ( b ) :
                if b [ i ] < a :
                    a += b [ i ]
                    i += 1
                else :
                    a += a - 1
                    res += 1
            return res
        def solve ( a , b ) :
            b.sort ( )
            best = b [ 0 ]
            for i in range ( 0 , len ( b ) ) :
                best = min ( best , calc ( a , [ b [ i ] ] ) + ( len ( b ) - i ) )
            print ( best )
        def run ( ) :
            with open ( "input.txt" , "r" ) as f :
                t = f.readline ( ).split ( ) [ 0 ]
                for it in range ( t ) :
                    print ( "Case #%d: " % ( it + 1 ) , end = "" )
                    a , n = f.readline ( ).split ( )
                    b = [ pow ( a , n ) for i in range ( n ) ]
                    solve ( a , b )
    def main ( ) :
        return A ( )
    return main

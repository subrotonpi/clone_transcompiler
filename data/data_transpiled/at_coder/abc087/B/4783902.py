def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.randint ( 1 , 100 )
        b = sc.randint ( 1 , 100 )
        c = sc.randint ( 1 , 100 )
        sam = sc.randint ( 1 , 100 )
    def main ( ) :
        count = 0
        for i in range ( 0 , a ) :
            for j in range ( 0 , b ) :
                for k in range ( 0 , c ) :
                    total = i * 500 + j * 100 + k * 50
                    if total == sam :
                        count += 1
        sys.stdout.write ( count )

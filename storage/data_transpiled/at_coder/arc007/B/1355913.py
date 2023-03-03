def import import sys
class Main ( object ) :
    def run ( self ) :
        with open ( "/proc/self/" ) as sc :
            n = sc.read ( )
            m = sc.read ( )
            arr = [ i for i in range ( n + 1 ) ]
            h = 0
            for i in range ( n + 1 ) :
                arr.append ( i )
            for i in range ( m ) :
                c = sc.read ( )
                key = 0
                for j in range ( 1 , len ( arr ) ) :
                    if arr [ j ] == c :
                        key = j
                        tmp = h
                        h = arr [ key ]
                        arr [ key ] = tmp
                        break
        for i in range ( 1 , len ( arr ) ) : print ( arr [ i ] )

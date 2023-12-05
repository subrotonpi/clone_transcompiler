def import import sys
class Main ( object ) :
    def run ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            n = sc.read ( )
            arr = [ ]
            max , max_id = sys.maxint , - 1
            min , min_id = sys.maxint , - 1
            for i in range ( n ) :
                m = sc.read ( )
                arr.append ( m )
                if m > max :
                    max , max_id = m , i
                if m < min :
                    min , min_id = m , i
            id = max if abs ( max ) - abs ( min ) > 0 else min_id
            print ( 2 * n - 2 )
            for i in range ( n ) :
                if i != id :
                    print ( '%d %d' % ( id + 1 , i + 1 ) )
            if abs ( max ) - abs ( min ) > 0 :
                for i in range ( n - 1 ) :
                    print ( '%d %d' % ( i + 1 , i + 2 ) )
            else :
                for i in range ( n - 1 , 0 , - 1 ) :
                    print ( '%d %d' % ( i + 1 , i ) )

def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        po = [ 0 ] * ( n + 1 )
        x = [ Po ( sc.readline ( ) , sc.readline ( ) , i ) for i in range ( m ) ]
        x.sort ( key = lambda a : a.value )
        for i in x :
            po [ i.place ] += 1
            i.make ( "%012d" % ( long ( 1000000 * i.place ) + po [ i.place ] ) )
        x.sort ( key = lambda a : a.index )
        for i in x :
            print ( i.id )
    class Po ( object ) :
        def __init__ ( self , a , b , i ) :
            self.place = a
            self.index = i
            self.value = b
        def make ( self , po ) :
            self.id = po

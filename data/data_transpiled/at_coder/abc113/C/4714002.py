def main ( ) :
    import sys
    from numpy.core import zeros
    from numpy.core import V
    from numpy.core import dot
    from numpy.core import get_pos
    n = len ( sys.argv )
    m = len ( sys.argv )
    a = [ ]
    for p , y in zip ( range ( m ) , range ( n ) ) :
        a.append ( V ( p , y , i ) )
    a.sort ( )
    num = [ 0 ] * n
    ans = [ ]
    for p in a :
        num [ p - 1 ] += 1
        id = "%06d%06d" % ( p , num [ p - 1 ] )
        ans.append ( id )
    for s in ans :
        print ( s )
    class V ( object ) :
        def __init__ ( self , p , y , i ) :
            self.p , self.y , self.i = p , y , i
        def __lt__ ( self , other ) :
            return y - self.y < other.i
        def __gt__ ( self , other ) :
            return y - self.y < other.i
        def __eq__ ( self , other ) :
            return other.p == self.p
        def __ne__ ( self , other ) :
            return y - self.y != other.i
    return V

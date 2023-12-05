def import _union
import os
import sys
def main ( ) :
    f = open ( sys.argv [ 1 ] )
    ss = f.readline ( ).split ( )
    n , k , l = [ int ( i ) for i in ss [ : k ] ]
    ufr , uft = _union ( n ) , _union ( n )
    for i in range ( k ) :
        ss = f.readline ( ).split ( )
        ufr.unite ( int ( ss [ 0 ] ) - 1 , int ( ss [ 1 ] ) - 1 )
    for i in range ( l ) :
        ss = f.readline ( ).split ( )
        uft.unite ( int ( ss [ 0 ] ) - 1 , int ( ss [ 1 ] ) - 1 )
    d = { }
    keys = [ ]
    for i in range ( n ) :
        key = u'{} {}'.format ( ufr.find ( i ) , uft.find ( i ) )
        keys.append ( key )
        val = d.get ( key )
        d [ key ] = 1 if val is None else val + 1
    print ( " ".join ( [ d [ key ] , str ( val ) ] ) )
class UnionFind ( os.path.getsize ( sys.argv [ 1 ] ) ) :
    def __init__ ( self , size = 0 ) :
        self.parent = [ ]
        self.rank = [ ]
    def find ( self ) :
        return self.rank [ 0 ]
    def same ( self , x ) :
        return self.rank [ 0 ]
    def show ( self ) :
        print ( " ".join ( [ str ( x ) for x in self.parent ] ) )

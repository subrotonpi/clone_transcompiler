def import _pairs_sort
import sys
class Pair ( object ) :
    def __init__ ( self , i , j ) :
        self.a = i
        self.cnt = j
    def __lt__ ( self , p ) :
        if self.cnt == p.cnt : return 0
        if self.cnt < p.cnt : return - 1
        return 1
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        N = int ( sc.next ( ) )
    def __init__ ( self , n ) :
        dict = { }
        l = [ ]
        for i in range ( N ) :
            c = int ( sc.next ( ) )
            for j in range ( 3 ) :
                if j == 1 : c -= 1
                elif j == 2 : c += 2
                if c not in dict :
                    p = Pair ( c , 1 )
                    dict [ c ] = p
                    l.append ( p )
                else :
                    p = dict [ c ]
                    p.cnt += 1
    l.sort ( )
    res = l [ - 1 ]
    print ( res.cnt )

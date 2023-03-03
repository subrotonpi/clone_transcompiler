def import _unicode_pat
import math
import numpy
import numpy
class Bai1 :
    class Segment :
        def __init__ ( self , st , fn , v ) :
            self.v , self.len = time * ( self.v + more )
            self.st , self.fn = st , fn
            self.len = fn - st
            self.v = v
        def __lt__ ( self , other ) :
            if self.v < other.v : return - 1
            elif self.v == other.v : return 0
            else : return 1
    def main ( ) :
        sc = _unicode_pat ( )
        pw = open ( "Alarge.out" , "w" )
        ntest = sc.count ( )
        for test in range ( 1 , ntest + 1 ) :
            x = sc.get ( "x" )
            walk = sc.get ( "walk" )
            run = sc.get ( "run" )
            more = run - walk
            t = sc.get ( "t" )
            n = sc.count ( )
            lst = [ ]
            a = [ ]
            for b , e , v in zip ( sc.get ( "b" ) , sc.get ( "e" ) , sc.get ( "v" ) ) :
                a.append ( Segment ( b , e , v + walk ) )
            a.sort ( key = lambda s1 : s1.st , reverse = True )
            total = 0
            for s in lst : total += s.len / s.v
            for i in range ( n ) :
                if i > 0 :
                    if a [ i ].st > a [ i - 1 ].fn :
                        lst.append ( Segment ( a [ i - 1 ].fn , a [ i ].st , walk ) )
                lst.append ( a [ i ] )
            if a [ n - 1 ].fn < x :
                lst.append ( Segment ( a [ n - 1 ].fn , x , walk ) )
    Bai1.main ( )

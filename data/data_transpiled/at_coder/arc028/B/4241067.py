def import import _Person
import sys
import csv
class Main ( object ) :
    def __init__ ( self ) :
        pass
    def __call__ ( self , f ) :
        arr = f.readline ( ).split ( )
        n , k = [ int ( i ) for i in arr [ : n ] ]
        arr = f.readline ( ).split ( )
        last = None
        seen = sorted ( [ ( p1.age , p2.age ) for p1 , p2 in zip ( arr , arr [ n : ] ) ] )
        lines = [ ]
        for i in range ( n ) :
            p = Person ( i + 1 , int ( arr [ i ] ) )
            seen.append ( p )
            if i == 0 :
                last = p
            elif i <= k - 1 :
                if last.age < p.age :
                    last = p
            else :
                if last.age > p.age :
                    last = seen.lower ( last )
            if i >= k - 1 :
                lines.append ( last.rank + "\n" )
        sys.stdout.write ( "".join ( lines ) )
class Person ( object ) :
    def __init__ ( self , rank , age ) :
        self.rank = rank
        self.age = age
    def __eq__ ( self , other ) :
        p = Person ( rank , age )
        return p.rank == rank and p.age == age
    def __hash__ ( self ) :
        return self.rank + self.age

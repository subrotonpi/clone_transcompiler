def import _sys
import sys
import os
import sys
import sys
import sys
import sys
import sys
import os
import sys
class Main ( object ) :
    def solve ( self ) :
        with open ( self.filename , 'r' ) as f :
            return f.read ( )
    def solve ( self ) :
        with open ( self.filename , 'r' ) as f :
            n = f.read ( )
            m = f.read ( )
            used = [ False ] * n
            path = [ [ ] for i in range ( n ) ]
            a = [ i - 1 for i in range ( m ) ]
            b = [ i - 1 for i in range ( m ) ]
            path [ a ].append ( b [ i ] )
            path [ b ].append ( a [ i ] )
    ans1 = Queue ( )
    ans2 = Stack ( )
    start = 0
    used [ start ] = True
    ans1.add ( start )
    end1 = start
    end2 = path [ end1 ] [ 0 ]
    used [ end2 ] = True
    ans1.add ( end2 )
    while 1 :
        next = - 1
        for i in range ( len ( path [ end2 ] ) ) :
            if not used [ path [ end2 ] [ i ] ] :
                next = path [ end2 ] [ i ]
                ans1.add ( next )
                used [ next ] = True
                end2 = next
                break
        if next == - 1 :
            break
    while 1 :
        next = - 1
        for i in range ( len ( path [ end1 ] ) ) :
            if not used [ path [ end1 ] [ i ] ] :
                next = path [ end1 ] [ i ]
                ans2.push ( next )
                used [ end1 ] = True
                end1 = next
                break
        if not used [ path [ end1 ] [ 0 ] :
            break

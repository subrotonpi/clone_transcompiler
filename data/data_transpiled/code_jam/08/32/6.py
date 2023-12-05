def import _buffered_attempt1
import os
import sys
class b ( object ) :
    def __init__ ( self ) :
        self.sol = 0
        if self.s == '' :
            return self.now
        elif self.s == '' :
            return self.bef + self.now
        elif self.s == '' :
            return self.bef - self.now
    def ugly ( x ) :
        if x < 0 :
            x = - x
        if x % 2 == 0 :
            return True
        if x % 3 == 0 :
            return True
        if x % 5 == 0 :
            return True
        if x % 7 == 0 :
            return True
        return False
    def count ( self , poz , lop , bef , now ) :
        if self.poz == len ( self.s ) - 1 :
            if ugly ( calc ( lop , bef , now ) ) :
                self.sol += 1
            else :
                pass
        else :
            c = ord ( self.s [ self.poz + 1 ] ) - ord ( '0' )
            count ( self.poz + 1 , lop , bef , 10 * self.now + c )
            if self.poz != len ( self.s ) - 1 :
                count ( self.poz + 1 , 1 , calc ( lop , bef , now ) , c )
                count ( self.poz + 1 , 2 , calc ( lop , bef , now ) , c )
    def b ( self ) :
        with open ( 'B-small-attempt1.in' , 'r' ) as f :
            input = f.readlines ( )
        with open ( 'small.out' , 'w' ) as out :
            nrtests = int ( input.count ( 1 ) )
            for nrt in range ( nrtests ) :
                s = input.readline ( )
                self.sol = 0
                count ( 0 , 0 , 0 , ord ( self.s [ 0 ] ) - ord ( '0' ) )
                out.write ( 'Case #%d: %s\n' % ( nrt + 1 , sol ) )
            
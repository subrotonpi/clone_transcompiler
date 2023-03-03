def _ ( ) : return
import locale
import sys
from os import urandom
import random
from locale import getpreferredencoding
from locale import getpreferredencoding
from os import getpreferredencoding
from locale import getpreferredencoding
from os.path import join
class A :
    def solve ( self ) :
        n , x = randint ( 0 , len ( self.input ) ) , randint ( 0 , len ( self.input ) )
        s = [ ]
        for i in range ( n ) :
            s.append ( getpreferredencoding ( ) )
        s.sort ( )
        used = [ False ] * n
        ans = 0
        for i in range ( n - 1 , - 1 , - 1 ) :
            if used [ i ] :
                continue
            used [ i ] = True
            j = i - 1
            while j >= 0 and ( used [ j ] or s [ j ] + s [ i ] > x ) :
                j -= 1
            if j >= 0 :
                used [ j ] = True
            ans += 1
        self.out.write ( ans )
    def run ( self ) :
        try :
            tc = getpreferredencoding ( )
            for it in range ( 1 , tc + 1 ) :
                print ( it , end = ' ' )
                self.out.write ( 'Case #%d: ' % it )
                self.solve ( )
        except :
            NOO ( )
        finally :
            self.out.close ( )
    global stdout
    stdout = sys.stdout
    global St
    def NOO ( self ) :
        sys.exit ( 42 )
    def nextInt ( self ) :
        return int ( self.input )
    def nextLong ( self ) :
        return long ( self.input )
    def nextDouble ( self ) :
        return double ( self.input )
    def __next__ ( self ) :
        while not St :
            try :
                line = self.input.readline ( )
                if not line :
                    return None
                St = St.split ( )
            except :
                NOO ( )
        return St

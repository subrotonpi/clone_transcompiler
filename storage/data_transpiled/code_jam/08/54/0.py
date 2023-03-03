def _import ( stdin ) : return stdin.read ( )
import os
import sys
import os
import locale
import sys
class D ( object ) :
    NAME = 'd-large'
    def __init__ ( self ) :
        self.stdin = open ( self.NAME + '.in' , 'w' )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.readword ( ) , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
        self.stdin.write ( 'Case #%d: %s\n' % ( self.dotest , self.dotest ) )
    def readword ( self ) :
        b = [ ]
        while True :
            c = self.stdin.read ( 1 )
            if c < 0 :
                break
        return b

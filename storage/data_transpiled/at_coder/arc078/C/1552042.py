def _readline ( ) : return _readline ( )
import sys
import io
import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
    def readline ( self ) :
        self.stdin = open ( self.stdin )
        self.stdout = open ( self.stdout )
        self.stdout.write ( '! ' + str ( self.doit ( ) ) + '\n' )
        self.stdout.flush ( )
        self.debug ( self.Q )
    def power10 ( self ) :
        self.base = 1
        self.q = 9
        while not self.query ( self.q ) :
            self.q *= 10
            self.q += 9
            self.base *= 10
        return self.base
    def doit ( self ) :
        self.base = 1
        while self.query ( self.base ) :
            self.base *= 10
            if self.base >= 1e11 :
                return self.power10 ( )
    K = base / 10
    geta = 999999999_999999999L
    dec = 17
    who = 0
    for k in range ( K , 1 , - 1 ) :
        B = int ( math.pow ( 10 , dec ) )
        min = ( k == K )
        max = 9
        while self.max - min > 1 :
            med = ( self.max + min ) // 2
            Q = self.geta - 9 * B + med * B
            if self.query ( Q ) :
                max = self.med
            else :
                min = self.med
        self.geta -= 9 * B
        self.geta += max * B
        who *= 10
        who += max
        dec -= 1
    def read ( self , n ) :
        self.Q += 1
        self.stdout.write ( '? ' + str ( n ) + '\n' )
        self.stdout.flush ( )
        return self.stdin.readline ( )
    def read ( self , n ) :
        self.stdin.read ( self.BUFFER_SIZE )
        self.stdout.write ( '\n' )
        self.stdin.read ( self.BUFFER_SIZE )

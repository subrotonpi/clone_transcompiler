def _import ( ) : return sys.stdin.read ( )
import io
import sys
import struct
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = FastScanner ( )
    def ni ( self ) :
        return int ( self.sc.next ( ) )
    def next ( self ) :
        if not self.hasNext ( ) : raise StopIteration
        s = [ ]
        while is_printable_char ( s ) :
            s.append ( s )
        return s
    def run ( self ) :
        n = self.ni ( )
        m = self.ni ( )
        if b == '-' :
            minus = True
            b = self.readByte ( )
        if b < '0' or b <= '9' :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return minus , n
            else :
                raise ValueError ( )
            b = self.readByte ( )
def read ( self ) :
    if not self.hasNext ( ) : raise StopIteration
    n = self.ni ( )
    m = self.ni ( )
    s = self.readByte ( )
    adj = [ list ( range ( 0 , m ) ) ]
    for u , v in zip ( self.ni ( ) , self.ni ( ) ) :
        adj [ u ].append ( v )
        adj [ v ].append ( u )
    queue = [ ( a , b ) for a , b in zip ( self.adj , self.adj ) ]
    d = [ ]
    done = [ False for i in range ( n + 1 ) ]
    queue.append ( s )
    d.append ( s )
    while len ( queue ) > 0 :
        e = queue.pop ( )
        if e in done :
            continue
        done [ e ] = True
        for i in adj [ e ] :
            c = min ( d [ e ] , i )
            if c > d [ i ] :
                d [ i ] = c
                queue.append ( i )
    f = open ( self.outfile , 'w' )
    for i in range
def import import struct
from os.path import isfile , realpath
from os import urandom
from os import urandom
from random import randint
from struct import Struct
from os.path import expanduser
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.environ import environ
from os.environ import expanduser
from os.environ import environ
from os.environ import environ
from os.chdir
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        self.stream = open ( expanduser ( '~/.MyScanner' ) , 'w' )
        H , W , N = struct.unpack ( '!H' , sc.read ( 4 ) )
        self.stream = sorted ( [ ( a , b ) for a , b in zip ( sc.read ( N ) , sc.read ( N ) ) ] )
    def scan ( self ) :
        ans = H
        can_from = 1
        while not self.stream.closed and self.stream.closed :
            ans = min ( ans , self.stream.popleft ( ).f - 1 )
        for j in range ( 2 , W + 1 ) :
            can_from += 1
            tmp = ( can_from , j )
            while tmp in self.stream :
                self.can_from += 1
                tmp.f += 1
            next = self.stream.popleft ( )
            if not next.stream.closed and next.stream.closed :
                ans = min ( ans , next.stream.popleft ( ).f - 1 )
        self.stream.write ( ans )
        self.stream.flush ( )
    def scan ( self ) :
        for s in self.stream :
            try :
                s = realpath ( s )
            except OSError :
                break
        else :
            s = s.lower ( )
            if s == self.stream.getvalue ( ) :
                return s
        return map ( ord , s )

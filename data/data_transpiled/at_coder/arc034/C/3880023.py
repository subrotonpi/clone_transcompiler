def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import shlex
import sys
import sys
import os.environ [ 'HOME' ] = os.environ [ 'HOME' ]
import os.environ [ 'HOME' ] = os.environ [ 'HOME' ]
import sys
import sys
class Main ( object ) :
    def __init__ ( self , a = 0 ) :
        sc = os.environ [ 'HOME' ]
        A = sc ( )
        B = sc ( )
        if A == B :
            self.pl ( 1 )
            sys.exit ( 0 )
    def __init__ ( self , a = 0 ) :
        for i in range ( 2 , a + 1 ) :
            if a % i == 0 :
                self.p.append ( i )
                self.fra ( a / i , self.a )
                return
        self.p.append ( a )
    def __init__ ( self , a = 0 ) :
        for i in range ( 2 , a + 1 ) :
            if a % i == 0 :
                self.p.append ( i )
                self.fra ( a / i , self.a )
                return
        self.unko = [ ]
        yks = [ ]
        for i in range ( 5000 ) :
            yks.append ( 0 )
        cnt = 0
        for i in range ( B + 1 , A + 1 ) :
            unko = [ ]
            self.fra ( i , unko )
            for tm in unko :
                if tm > 1 :
                    yks.append ( tm )
                    cnt += 1
        self.reform = [ ]
        for i in range ( cnt ) :
            self.reform.append ( yks [ i ] )
        self.reform.sort ( )
        now = self.reform [ 0 ]
        kosu = 1
        sum = 1
        lsm = 0
        for i in range ( 1 , cnt ) :
            if self.reform [ i ] != now :
                sum *= ( kosu + 1 )
                sum %= 1000000007
                now = self.reform [ i ]
                kosu = 1
                lsm = i
            else :
            INDENT
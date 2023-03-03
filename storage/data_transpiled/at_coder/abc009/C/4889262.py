def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import time
import math
import shlex
class Main ( object ) :
    def __init__ ( self ) :
        sc = readline ( )
        self.N = sc.__next__ ( )
        self.K = sc.__next__ ( )
        self.s = sc.next ( )
        self.c_num = [ 0 for i in range ( 26 ) ]
        for c in self.s :
            self.c_num [ c - 'a' ] += 1
        ans = ""
        count = K
        for c in self.s :
            current_c = c
            replace = False
            for j in range ( len ( self.c_num ) ) :
                self.c_num [ j ] -= 1
                if self.c_num [ j ] >= 0 and ( current_c == c + 'a' or _can_replace ( self.s [ c + 1 : ] , self.c_num , count - 1 ) ) :
                    if current_c != c + 'a' :
                        count -= 1
                    ans += chr ( j + 'a' )
                    replace = True
                    break
                else :
                    self.c_num [ j ] += 1
            if not replace :
                ans += current_c
                self.c_num [ current_c - 'a' ] -= 1
        self.pl ( ans )
    def _can_replace ( substring , c_num , count ) :
        tmp_num = [ ]
        for i in range ( 26 ) :
            tmp_num.append ( c_num [ i ] )
        replace_count = 0
        for c in substring :
            if tmp_num [ c - 'a' ] > 0 :
                tmp_num [ c - 'a' ] -= 1
            else :
                replace_count += 1
        return count >= replace_count
    class SC ( readline ) :
        def __init__ ( self ) :
            self.sc = None
            self.tokens = None
            self.tokens = None
            self.tokens = None
            self.tokens = None
            self.tokens = None
            self.tokens = None
            self.tokens = None
            self.tokens = None
            self.tokens = None

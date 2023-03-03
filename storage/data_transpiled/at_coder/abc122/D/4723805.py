def import _memo
import os
import sys
import string
import struct
import time
import sys
import string
import struct
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.MOD = 1000000007L
    def __init__ ( self , size ) :
        sc = string.split ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( ) ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) , "" ) ) )
        self.N = size
        for i in range ( 0 , size ) :
            self.memo.append ( { } ) )
        print ( self.dfs ( 0 , "TTT" ) ) )
    def ok ( last4 ) :
        for i in range ( 4 ) :
            t = last4.split ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( string.replace ( ) ( )
            ( )
        ) ) ) ) ) ) ) ) ) , "" ) ) ) ) ) )
        if i >= 1 :
            buf = t [ i - 1 ]
            t [ i - 1 ] = t [ i ]
            t [ i ] = buf
        if str ( t ).find ( "AGC" ) >= 0 :
            return False
        return True
    def dfs ( cur , last3 ) :
        if last3 in memo [ cur ] :
            return memo [ cur ] [ last3 ]
        if cur == N :
            return 1
        ret = 0
        c_list = [ 'A' , 'C' , 'G' , 'T' ]
        for c in c_list :
            if ok ( last3 + c
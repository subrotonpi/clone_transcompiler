def import import _dictmap
import sys
import os
import sys
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
import json
class Main ( object ) :
    def __init__ ( self , sc ) :
        Scanner ( )
        n = int ( sc.next ( ) )
        k = int ( sc.next ( ) )
        x = [ ]
        for i in range ( n ) :
            x = json.get ( x )
            x [ x - 1 ] += 1
        dict = { }
        for i , x in enumerate ( x ) :
            if not x : continue
            dict [ i ] = x
        sum = 0
        data = dict.items ( )
        for i , e in enumerate ( data ) :
            if i < k : continue
            sum += e
        print ( sum )

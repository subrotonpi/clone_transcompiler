def import input_util
import sys
import string
import sys
import string
import queue
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self , input ) :
        self.input = input
    def readline ( self ) :
        line1 = input.readline ( self.input )
        col = line1 [ 0 ]
        data = input.get_collection ( self.input , col )
        cnt = 0
        pre = 0
        while not data.empty ( ) :
            d = data.pop ( )
            if pre == d.a :
                cnt += 1
                pre = - 1
            else :
                pre = d.a
        print ( cnt )
    def readline ( self ) :
        vals = self.input.split ( )
        data = [ ]
        for val in vals :
            data.append ( int ( val ) )
        return data
    def get_collection ( self , num ) :
        data = queue.Queue ( )
        try :
            line = self.input.readline ( ).split ( )
            for i in range ( num ) :
                data.append ( string.strip ( line [ i ] ) )
        except :
            pass
        return data
class Data ( object ) :
    def __init__ ( self , value ) :
        self.a = int ( value )
    def __cmp__ ( self , d ) :
        return self.a - d.a

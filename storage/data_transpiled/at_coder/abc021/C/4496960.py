def _ _ main _ _ ( ) : return
from os import isatty
from io import BytesIO
import readline
from io import BytesIO
import __builtin__
import numpy as np
from collections import OrderedDict
import tokenize
class Main ( object ) :
    class sc :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.N = sc.randint ( 0 , N )
            self.a = sc.randint ( 0 , N ) - 1
            self.b = sc.randint ( 0 , N ) - 1
            self.M = sc.randint ( 0 , N )
            self.x = [ ]
            self.y = [ ]
            self.MOD = 1000000007
            self.dp = [ ]
            for i in range ( self.M ) :
                self.x.append ( sc.randint ( 0 , N ) )
                self.y.append ( sc.randint ( 0 , N ) )
                self.dp [ self.x [ i ] ] [ self.y [ i ] ] = 1
                self.dp [ self.y [ i ] ] [ self.x [ i ] ] = 1
            for i in range ( self.N ) :
                for j in range ( self.N ) :
                    if i != j and self.dp [ i ] [ j ] == 0 :
                        self.dp [ i ] [ j ] = 1000
            self.Warshall_floyd ( )
            self.dag = { }
            for i in range ( self.M ) :
                if self.dp [ a ] [ x [ i ] ] == self.dp [ a ] [ y [ i ] ] + 1 :
                    self.dag [ y [ i ] ] [ x [ i ] ] = 1
                if self.dp [ a ] [ x [ i ] ] == self.dp [ a ] [ y [ i ] ] - 1 :
                    self.dag [ x [ i ] ] [ y [ i ] ] = 1
    dict = OrderedDict ( )
    for i in range ( self.N ) :
        d = self.dp [ a ] [ i ]
        if d in dict :
            list = dict [ d ]
            list.append ( i )
            dict [ d ] = list
        else :
            list = [ ]
    return dict
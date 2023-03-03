def import _split
import os
import sys
class AlienSmall ( object ) :
    def __init__ ( self , test ) :
        self.allList = [ ]
        list = [ ]
        for i in test :
            if i == '(' :
                inPara = True
            elif i == ')' :
                inPara = False
                self.allList.append ( list )
                list = [ ]
            else :
                list.append ( "%s" % i )
                if not inPara :
                    self.allList.append ( list )
                    list = [ ]
    def solve ( self ) :
        solution = [ 0 ] * d
        total = 0
        i , j = 0 , 0
        for i in self.allList :
            b = [ True ] * 26
            for j in self.allList [ i ] :
                b [ j [ 0 ] - 97 ] = True
            for j in self.allList [ i ] :
                if b [ dic [ j ] [ i ] - 97 ] :
                    if i == 0 :
                        solution [ j ] = 1
                else :
                    solution [ j ] = 0
        for i in self.allList :
            total += solution [ i ]
        return total
    def main ( self , args ) :
        with open ( 'src/A-large.in' , 'r' ) as f :
            with open ( 'output' , 'w' ) as f :
                tokens = f.readline ( ).split ( )
                self.l , self.d , self.n = int ( tokens [ 0 ] ) , int ( tokens [ 1 ] ) , int ( tokens [ 2 ] )
                dic = [ ]
                for i in self.allList :
                    dic.append ( f.readline ( ) )
                for i in self.allList :
                    solution [ i ] += 1
return AlienSmall

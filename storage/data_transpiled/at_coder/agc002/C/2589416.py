def import import sys
import os
import sys
import string
import string
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.input = string.split ( string.punctuation )
        self.count = int ( self.input [ 0 ] )
        self.max_length = int ( self.input [ 1 ] )
        input2 = string.split ( string.punctuation )
        self.result = [ ]
        for i in range ( self.count ) :
            if i + 1 >= self.count :
                break
            num = int ( self.input [ i ] )
            num2 = int ( self.input [ i + 1 ] )
            if num + num2 >= self.max_length :
                for j in range ( self.input [ i ] ) :
                    self.result.append ( j + 1 )
                for n in range ( self.input [ count - 1 ] , self.input [ i + 1 ] , - 1 ) :
                    self.result.append ( n )
                self.result.append ( self.input [ i + 1 ] )
                print ( 'Possible' )
                for re in self.result :
                    print ( re )
                return
        print ( 'Impossible' )

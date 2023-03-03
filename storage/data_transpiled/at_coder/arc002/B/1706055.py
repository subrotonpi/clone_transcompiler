def import datetime
import sys
import datetime
class Main ( object ) :
    def __init__ ( self ) :
        self.year = datetime.datetime.now ( ).year
        self.month = datetime.datetime.now ( ).month + 1
        self.day = datetime.datetime.now ( ).day
        return True if self.year % ( self.month * self.day ) == 0 else False
    def find_date ( self , args ) :
        with open ( '/proc/date' , 'r' ) as f :
            date = f.readline ( ).split ( '/' , 1 )
            self.year , self.month , self.day = int ( date [ 0 ] ) , int ( date [ 1 ] ) , int ( date [ 2 ] )

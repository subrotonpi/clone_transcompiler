def import import os
import sys
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 1 ]
    def __str__ ( self ) :
        return self.name
map = { 'Sunday' : 0 , 'Monday' : 5 , 'Tuesday' : 4 , 'Wednesday' : 3 , 'Thursday' : 2 , 'Friday' : 1 , 'Saturday' : 0 }
print ( map [ str ( sys.argv [ 1 ] ) ] )

def import readline
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import readline
import readline
import readline
import readline
import readline
import sys
import readline
import readline
import readline
import readline
import readline
import readline
import time
T = int
N = int
tako = readline.readline
M = int
customers = readline.readline
print ( 'yes' if sellable ( N , M , tako , customers , T ) else 'no' )
def sellable ( N , M , tako , customers , T ) :
    sold = 0
    for i in range ( M ) :
        while sold < N and tako [ sold ] + T < customers [ i ] :
            sold += 1
        if sold == N or tako [ sold ] > customers [ i ] :
            return False
        sold += 1
    return True
class CustomReader ( readline ) :
    import readline
    def __init__ ( self ) :
        readline.__init__ ( self )
        self.DEFAULT_BUF_SIZE = 2048
        readline.__init__ ( self )
        self.DEFAULT_BUF_SIZE = 2048
    def readline ( self ) :
        str_array = self.readline.split ( )
        int_array = [ int ( i ) for i , n in enumerate ( str_array ) ]
        return int_array
    def readline ( self ) :
        return readline
    def readline ( self ) :
        return self.DEFAULT_BUF_SIZE

def import _compare_keys
import sys
import string
import string
import string
import sys
import string
import string
import string
import string
class Main ( object ) :
    def __init__ ( self , size = 0 ) :
        string = string
        size = len ( string.ascii_letters )
        list = string.ascii_letters + string.digits
        list.sort ( key = natural_key )
        start = 9999
        end = - 1
        for data in list :
            record = data.split ( '-' )
            rainstart = int ( record [ 0 ] )
            rainend = int ( record [ 1 ] )
            rainstart -= rainstart % 5
            if rainend % 5 > 0 :
                rainend += 5 - rainend % 5
            if rainend % 100 == 60 :
                rainend += 40
            if rainstart > end :
                if start != 9999 :
                    print ( '%04d' % start , '-' , end )
                start = rainstart
                end = - 1
            if end < rainend :
                end = rainend
        print ( '%04d' % start , '-' , end )

def _ ( ) : return '.'
import time
import sys
import string
import string
import string
class A :
    def __init__ ( self , stdout , stderr ) :
        self.stdout = stdout
        self.stderr = stderr
    def __init__ ( self , stdout , stderr ) :
        self.stdout = stdout
        self.stderr = stderr
        self.raw_input = stdout
        self.stdout = stdout
        self.stderr = stderr
        self.start_time = time.time ( )
        self.end_time = time.time ( )
        self.sec = self.end_time - self.start_time
        self.min = self.sec / 60
        self.err ( 'Time Spent: %d minute(s) %d second(s)' % ( self.min , self.sec , self.sec ) )
    def main ( self ) :
        try :
            TCase , cc = self.raw_input ( )
            for cc in range ( 1 , TCase + 1 ) :
                n , K = self.raw_input ( )
                B = [ ]
                for i in range ( n ) :
                    B.append ( shift ( self.raw_input ( ) ).split ( ) )
                for i in range ( n ) :
                    pass
                red , blue = self.check ( 'R' )
                if red and blue :
                    T = 'Both'
                elif red :
                    T = 'Red'
                elif blue :
                    T = 'Blue'
                else :
                    T = 'Neither'
                print ( 'Case #%d: %s' % ( cc , T ) )
        except :
            pass
    def check ( ch ) :
        i , j = 0 , 0
        for i in range ( n ) :
            for j in range ( n ) :
                if i + K - 1 < n and OK ( i , j , 1 , 0 , ch ) :
                    return True
                if j + K - 1 < n and OK ( i , j , 1 , 1 , ch ) :
                    return True
                if i + K - 1 < n and j - ( K - 1 ) >= 0 and OK ( i , j , 1 , - 1 , ch ) :
                    return True
        return False

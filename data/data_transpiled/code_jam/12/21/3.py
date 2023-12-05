def _ ( ) : return
import time
import sys
import random
import time
import random
import sys
import random
import time
import time
class A ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( 'src/input.txt' , 'r' )
        self.stdout = open ( 'src/output.txt' , 'w' )
        self.stdout.write ( '%s ' % ( random.uniform ( 0 , 256 * ( 1 << 20 ) ) ) )
    def __call__ ( self ) :
        try :
            t1 = time.time ( )
            self.stdin = open ( 'src/input.txt' , 'r' )
            self.stdout = open ( 'src/output.txt' , 'w' )
            self.stdout.write ( '%s ' % ( random.uniform ( 0 , 256 * ( 1 << 20 ) ) ) )
        except ( EOFError , KeyboardInterrupt ) :
            self.stdout = open ( 'src/output.txt' , 'w' )
            self.stdout.write ( '%s ' % ( random.uniform ( 0 , 256 * ( 1 << 20 ) ) ) )
    def __next__ ( self ) :
        while not self.stdin.readline ( ) :
            self.stdin.write ( '%s ' % ( self.stdin.readline ( ) ) )
        return self.stdin.readline ( )
    def __next__ ( self ) :
        return int ( self.stdin.readline ( ) )
    def not_last ( self , a , id , percentage , sum ) :
        value = a [ id ] + sum * percentage
        left_sum = sum * ( 1 - percentage )
        b = [ i for i in a if i > value ]
        for i in range ( 1 , len ( b ) ) :
            if b [ i ] > value :
                break
            else :
                left_sum -= ( value - b [ i ] )
        if left_sum < 0 :
            return True
        else :
            return False
    def solve ( self ) :
        format = '%.%.4f' % ( random.uniform ( 0 , 255 * ( 1 << 20 ) ) )
        testcases = randint ( 1 , testcases )
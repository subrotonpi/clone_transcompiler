def import System
import Queue
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Cx , self.Cy = sys.maxint , sys.maxint
        self.H , self.flag = 0 , 0
    def run ( self ) :
        try :
            with open ( "../state_q.txt" , "r" ) as f :
                N = int ( f.read ( ) )
                q = Queue.Queue ( )
                for i in range ( 101 ) :
                    for j in range ( 101 ) :
                        q.put ( ( i , j , 0 , False ) )
            for n , xn , yn , hn in self.run ( ) :
                q.put ( ( n , xn , yn , hn ) )
                q.put ( ( n , xn , yn , hn ) )
        except EOFError :
            pass
        else :
            if n == 0 :
                if hn == 0 :
                    q.put ( ( state.Cx , state.Cy , h , True ) )
                else :
                    q.put ( ( state.Cx , state.Cy , h , False ) )
            else :
                if state.flag == True :
                    if hn == 0 :
                        q.put ( ( state.Cx , state.Cy , min ( h , state.H ) , True ) )
                    elif h <= state.H :
                        q.put ( ( state.Cx , state.Cy , h , False ) )
                else :
                    if hn > 0 and state.H == h :
                        q.put ( ( state.Cx , state.Cy , h , False ) )
                    elif hn == 0 and h >= state.H :
                        q.put ( ( state.Cx , state.Cy , h , False ) )

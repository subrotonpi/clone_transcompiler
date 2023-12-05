def _import ( ) : return sys.modules [ '__main__' ].__dict__
import os
import os
import threading
import threading
import threading
import threading
class Main ( object ) :
    def __init__ ( self ) :
        self.NUM_THREADS = 8
    def solve ( self , problem_number ) :
        self.myout = Myout.get ( problem_number )
        Scanner = self.myout
        Lock = self.mylock
        n = sc.randint ( 0 , self.NUM_THREADS )
        m = sc.randint ( 0 , self.num_THREADS )
        dic = [ ]
        for i in range ( 2 ) :
            for j in range ( 2 ) :
                dic [ i ].append ( sc.randint ( 0 , self.num_THREADS ) )
        def __lt__ ( self , m ) :
            return self.num - m.num
    class Myout ( object ) :
        def __init__ ( self , out , problem_number ) :
            self.out = StringIO ( )
            self.num = problem_number
            self.out.write ( "Case #%d: %d" % ( self.num , self.num + 1 ) )
        def flush ( self ) :
            self.out.write ( "Case #%d: %d" % ( self.num , self.num + 1 ) )
        def __lt__ ( self , m ) :
            return self.num - m.num
    def __init__ ( self , d ) :
        self.d = d
        self.d = d
        self.d = d
        self.num = d
    def set ( self , d ) :
        self.d = d
        self.d = d
        self.d = d
        self.num = d
    def run ( self ) :
        while True :
            self.lock ( )
            self.problem_num = now
            self.num += 1
    def run ( self ) :
        self.myout.write ( "Case #%d: %d" % ( self.num , self.num + 1 ) )
    def run ( self ) :
        self.myout.flush ( )
    def run ( self ) :
        self.myout.flush ( )
    
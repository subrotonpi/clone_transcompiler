def _ import _ , os , sys , os , sys , _ ) :
    import os , random , random , random , random , sys , sys
    from os import urandom
    import locale
    import os , random , sys
    class Solution ( object ) :
        MAXT = 100
        def __init__ ( self ) :
            self.MAXT = 100
            self.stdin = urandom ( random.randint ( 1 , MAXT ) )
            self.stdout = open ( os.path.join ( os.path.dirname ( __file__ ) , 'data' ) , 'w' )
            self.n = random.randint ( 1 , MAXT )
            self.m = random.randint ( 1 , MAXT )
            self.ac = [ random.randint ( 1 , MAXT ) for i in range ( 0 , m ) ]
            self.bt = [ random.randint ( 1 , MAXT ) for i in range ( 0 , m ) ]
            self.answer = calc_answer ( )
        def run ( self ) :
            try :
                self.solve ( )
            finally :
                self.stdout.close ( )
    def read ( self ) :
        return random.randint ( 1 , MAXT )
    def run ( self ) :
        try :
            self.stdin = open ( self.filename + '.in' , 'r' )
            self.stdout = open ( self.filename + '.out' , 'w' )
        except IOError :
            self.exit ( 1 )
    def run ( self ) :
        try :
            self.solve ( )
        finally :
            self.stdout.close ( )
    def run ( self ) :
        while not self.ans :
            self.ans = [ ]
    def run ( self ) :
        try :
            self.ans = [ ]
        except IndexError :
            return
    run ( self )

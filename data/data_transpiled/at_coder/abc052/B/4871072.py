def import _main
class Main ( object ) :
    def __init__ ( self , args ) :
        self.N = args.n
        self.S = args.s
        self.cnt = 0
        self.max = 0
        for c in S :
            if c == 'I' :
                self.cnt += 1
                self.max = max ( self.max , self.cnt )
            else :
                self.cnt -= 1
        print ( self.max )

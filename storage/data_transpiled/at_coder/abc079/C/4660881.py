def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.results = [ ]
        self.input = [ ]
    def dfs ( self , index , sum ) :
        with open ( self.input [ 0 ] , 'r' ) as f :
            line = f.readline ( )
            for c in line :
                self.input.append ( ord ( c ) )
            flg = self.dfs ( 0 , self.input [ 0 ] )
            A = str ( self.input [ 0 ] )
            B = str ( self.input [ 1 ] )
            C = str ( self.input [ 2 ] )
            D = str ( self.input [ 3 ] )
            print ( A + results [ 0 ] + B + results [ 1 ] + C + results [ 2 ] + D , end = '' )
    def dfs ( self , index , sum ) :
        if index == 3 and sum == 7 :
            return True
        elif index <= 2 :
            self.results.append ( '+' )
            if self.dfs ( index + 1 , sum + self.input [ index + 1 ] ) :
                return True
            self.results.append ( '-' )
            if self.dfs ( index + 1 , sum - self.input [ index + 1 ] ) :
                return True
        return False

def main ( ) :
    import sys
    class Main ( object ) :
        ONE_BTC_JPN_VALUE = 380000
        def __init__ ( self ) :
            self.N = len ( sys.argv )
            self.money = 0
            for x , u in zip ( sys.argv [ 1 : ] , sys.argv [ 2 : ] ) :
                if u == 'JPY' :
                    self.money += x
                else :
                    self.money += x * ONE_BTC_JPN_VALUE
            print ( self.money )

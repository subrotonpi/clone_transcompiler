def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = sys.argv.count
    def __init__ ( self ) :
        self.count = sys.argv.count
    def run ( self ) :
        scores = [ ]
        sum = 0
        for ix , val in enumerate ( self.scores ) :
            scores.append ( val )
            sum += scores [ ix ]
        scores.sort ( )
        for ix , val in enumerate ( scores ) :
            if sum % 10 != 0 :
                break
            if val % 10 != 0 :
                sum -= val
        if sum % 10 != 0 :
            print ( sum )
        else :
            print ( 0 )

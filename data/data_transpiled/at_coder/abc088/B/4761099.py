def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( sys.stdin.readline ( ) )
            self.data = [ int ( i ) for i in sys.stdin.readline ( ).split ( ' ' ) ]
            self.turn = 1
            self.alice_card = [ ]
            self.bob_card = [ ]
            while self.data :
                current_max = self.getMax ( self.data )
                if self.turn == 1 :
                    self.alice_card.append ( current_max )
                else :
                    self.bob_card.append ( current_max )
                self.turn = self.turn * - 1
                self.deleteMax ( self.data , current_max )
            self.alice_sum = self.getSum ( self.alice_card )
            self.bob_sum = self.getSum ( self.bob_card )
            print ( self.alice_sum - self.bob_sum )
        def getMax ( self ) :
            max = 0
            for num in self.data :
                if num > max :
                    max = num
            return max
        def deleteMax ( self , max ) :
            for ( elm , ) in self.data :
                if elm == max :
                    self.data.remove ( elm )
                    break
        def getSum ( self ) :
            sum = 0
            for elm in self.data :
                sum = sum + elm
            return sum
    Main ( )

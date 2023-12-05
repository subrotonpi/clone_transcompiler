def import _cheating_boolean_tree
class CheatingBooleanTree ( object ) :
    def __init__ ( self , value , node ) :
        self.value = value
        self.node = node
        self.gate = [ ]
        self.can_change = [ ]
        for i in range ( 1 , self.N + 1 ) :
            M , V = self.value , self.V
            self.gate.append ( self.gate [ i ] )
            self.can_change.append ( self.gate [ i ] == 1 )
        else :
            self.gate.append ( self.gate [ i ] )
        self.memo = [ ]
        for arr in self.memo :
            [ arr ] = - 1
        res = solve ( V , 0 )
        out = "IMPOSSIBLE" if res == INF else "%d" % ( res , )
        print ( "Case #%d: %s" % ( self.value , out ) )
    global M
    global memo
    global gate
    global can_change
    global INF
    INF = 1000000
    def solve ( self , value , node ) :
        if self.memo [ value ] [ node ] == - 1 :
            res = INF
            if 2 * node + 1 < M :
                if value == 0 :
                    cost = self.gate [ node ] == AND
                    min = min ( self.solve ( 0 , 2 * node + 1 ) , self.solve ( 0 , 2 * node + 2 ) )
                    res = min ( res , min + cost )
                else :
                    cost = self.gate [ node ] == OR
                    min = min ( self.solve ( 0 , 2 * node + 1 ) , self.solve ( 0 , 2 * node + 2 ) )
                    res = min ( res , min + cost )
            else :
                cost = self.gate [ node ] == OR
                min = min ( self.solve ( 1 , 2 * node + 1 ) , self.solve ( 1 , 2 * node + 2 ) )
                res = min ( res , min + cost )
        else :
            if value == gate [ node ] :
                res = 0
        self.memo [ value ] [ node ] = res

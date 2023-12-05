def import _main
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.N = int ( self.N )
        self.A = int ( self.A )
        self.B = int ( self.B )
        items = [ ]
        item_count = { }
        for i in range ( self.N ) :
            v = self.N [ i ]
            items.append ( v )
            item_count [ v ] = item_count.get ( v , 0 ) + 1
        uniq_nums = item_count.keys ( )
        items.sort ( )
        uniq_nums = [ i for i in uniq_nums if i not in item_count ]
        ai , ar , bi , br = uniq_nums [ ai ] , A , B , B
        ai , ai , ar , bi , br = [ i for i in items if i <= ai ]
        ai , ai , ar , bi , br = [ i for i in items if i <= ai ]
        ai , ai , ar , bi , br = [ i for i in items if i <= bi ]
        if ai == ( len ( uniq_nums ) - 1 ) :
            bound = max ( ar , item_count [ ai ] )
            if bi == ( len ( uniq_nums ) - 1 ) :
                bound = br
            for i in range ( ar , bound + 1 ) :
                patterns += combination ( item_count [ ai ] , i )
        else :
            patterns = combination ( item_count [ ai ] , ar )
        print ( max_avg )
        print ( patterns )
        self.N = int ( self.N )

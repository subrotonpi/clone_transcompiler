def import datetime
import datetime
import datetime
import datetime
class Main ( object ) :
    DATE_STR = '20190101'
    def __init__ ( self , * args , ** kwargs ) :
        self.DATE_STR = '20190101'
        self.result = [ ]
        self.i_pattern = 'uuuuMMddHHmm'
        self.o_pattern = 'HHmm'
    def main ( self ) :
        with open ( self.DATE_STR , 'r' ) as sc :
            lines = sc.readlines ( )
    times = defaultdict ( list )
    for line in lines :
        time = line.split ( '-' )
        if time [ 0 ] in times :
            if int ( times [ time [ 0 ] ] ) < int ( time [ 1 ] ) :
                times [ time [ 0 ] ].append ( time [ 1 ] )
        else :
            times [ time [ 0 ] ].append ( time [ 1 ] )
    before_start = None
    before_end = None
    for start in times :
        cur_start = datetime.strptime ( self.DATE_STR + start , '%Y-%m-%d' )
        cur_start = cur_start - datetime.timedelta ( minutes = cur_start.minute % 5 )
        cur_end = datetime.strptime ( self.DATE_STR + ( times [ start ] ) , '%Y-%m-%d' )
        if 0 < cur_end.minute % 5 :
            cur_end = cur_end + datetime.timedelta ( minutes = 5 - cur_end.minute % 5 )
        if before_start is None :
            before_start = cur_start
            before_end = cur_end
        elif cur_start > before_end :
            self.add_result ( before_start , before_end )
            before_start = cur_start
            before_end = cur_end
        elif cur_end > before_end :
            before_end = cur_end
    self.add_result ( before_start , before_end )
    for res in self.result :
        print ( res )
def add_result ( start , end ) :
    end_hm = o_pattern.format ( end )
    if end_hm == "0000" :
        end_hm = "2400"
    self.add_result ( end , end_hm )

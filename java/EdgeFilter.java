public class EdgeFilter extends AbstractFilter {
			
    public EdgeFilter(int filter_size) {
        super(filter_size);
        initKernel(filter_size);
    }
    
    private void initKernel(int filter_size) {
    	for (int i = 0; i < kernel.length; i++) {
            for (int j = 0; j < kernel.length; j++) {
                if (i == kernel.length/2 && j == kernel.length/2) {
                    kernel[i][j] = filter_size*filter_size-1;
                } else {
                    kernel[i][j] = -1;
                }
            }
        }
    }
}
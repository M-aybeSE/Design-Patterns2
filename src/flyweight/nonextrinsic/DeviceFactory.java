package flyweight.nonextrinsic;

import java.util.*;

public class DeviceFactory {

	private ArrayList devices = new ArrayList();

	private int totalTerminal = 0;
	
	public DeviceFactory() {
		NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
		devices.add(nd1);
		NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
		devices.add(nd2);
	}
	
	public NetworkDevice getNetworkDevice(String type) {
		if(type.equalsIgnoreCase("cisco")) {
			totalTerminal++;
			return (NetworkDevice)devices.get(0);
		} else if(type.equalsIgnoreCase("tp")) {
			totalTerminal++;
			return (NetworkDevice)devices.get(1);
		} else {
			return null;
		}
	}
	
	public int getTotalDevice() {
		return devices.size();
	}
	
	public int getTotalTerminal() {
		return totalTerminal;
	}

	// 通过依赖引入所需的亨元类
	// 1、在构造类时初始化好
/*	@Autowired
	private ApplicationContext applicationContext;

	private final Map<String,AdminCreateCheckStrategy> strategyMap = Maps.newHashMap();

	@PostConstruct
	public void init(){
		Map<String, AdminCreateCheckStrategy> beanMap = applicationContext.getBeansOfType(AdminCreateCheckStrategy.class);
		if(CollUtil.isEmpty(beanMap)){
			return ;
		}
		for (AdminCreateCheckStrategy strategy : beanMap.values()) {
			strategyMap.put(strategy.getAdminType().toLowerCase(), strategy);
		}
	}*/

	// 2、通过依赖进来 初始化
/*	private Map<MsgType, ContentDetailStrategy> contentDetailStrategieMap = Maps.newConcurrentMap();

	@Autowired
	private void init(List<ContentDetailStrategy> contentDetailStrategies){
		contentDetailStrategies.forEach(contentDetailStrategy ->
				contentDetailStrategieMap.put(contentDetailStrategy.getMsgType(),contentDetailStrategy)
		);
	}*/

}
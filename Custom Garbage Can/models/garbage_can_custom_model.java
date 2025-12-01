// Made with Blockbench 5.0.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class garbage_can_custom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "garbage_can_custom"), "main");
	private final ModelPart garbagecan;
	private final ModelPart base;
	private final ModelPart topRim;
	private final ModelPart corner;
	private final ModelPart corner2;
	private final ModelPart corner3;
	private final ModelPart corner4;
	private final ModelPart outerRim;

	public garbage_can_custom(ModelPart root) {
		this.garbagecan = root.getChild("garbagecan");
		this.base = this.garbagecan.getChild("base");
		this.topRim = this.garbagecan.getChild("topRim");
		this.corner = this.topRim.getChild("corner");
		this.corner2 = this.topRim.getChild("corner2");
		this.corner3 = this.topRim.getChild("corner3");
		this.corner4 = this.topRim.getChild("corner4");
		this.outerRim = this.topRim.getChild("outerRim");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition garbagecan = partdefinition.addOrReplaceChild("garbagecan", CubeListBuilder.create(), PartPose.offset(-6.0F, 24.0F, 2.0F));

		PartDefinition base = garbagecan.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -12.0F, -6.0F, 6.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition topRim = garbagecan.addOrReplaceChild("topRim", CubeListBuilder.create().texOffs(28, 8).addBox(2.0F, -14.0F, 1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 11).addBox(2.0F, -14.0F, -6.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shortrec_r1 = topRim.addOrReplaceChild("shortrec_r1", CubeListBuilder.create().texOffs(14, 20).addBox(-1.0F, -14.0F, 2.0F, 6.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition shortrec_r2 = topRim.addOrReplaceChild("shortrec_r2", CubeListBuilder.create().texOffs(0, 20).addBox(-1.0F, -14.0F, 3.0F, 6.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition corner = topRim.addOrReplaceChild("corner", CubeListBuilder.create().texOffs(28, 22).addBox(3.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 16).addBox(3.0F, -14.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 25).addBox(4.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition corner2 = topRim.addOrReplaceChild("corner2", CubeListBuilder.create().texOffs(28, 28).addBox(3.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 31).addBox(3.0F, -14.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 19).addBox(4.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, 4.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition corner3 = topRim.addOrReplaceChild("corner3", CubeListBuilder.create().texOffs(32, 22).addBox(3.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 25).addBox(3.0F, -14.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 28).addBox(4.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 0.0F, -4.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition corner4 = topRim.addOrReplaceChild("corner4", CubeListBuilder.create().texOffs(32, 31).addBox(3.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 34).addBox(3.0F, -14.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 34).addBox(4.0F, -14.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, -8.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition outerRim = topRim.addOrReplaceChild("outerRim", CubeListBuilder.create().texOffs(28, 0).addBox(8.0F, -2.0F, -5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -12.0F, 0.0F));

		PartDefinition cube_r1 = outerRim.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -6.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = outerRim.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(28, 0).addBox(-1.0F, -2.0F, -5.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, 3.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		garbagecan.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}